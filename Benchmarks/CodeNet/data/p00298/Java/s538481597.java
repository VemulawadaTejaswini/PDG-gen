import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line;
            int macchoNum = 0;
            while ((line = br.readLine()) != null) {
            	
            String[] macchoList = line.split(" ", 0);
            if(macchoList.length == 1) {
            		macchoNum = Integer.valueOf(macchoList[0]);
            }
            //??????????????§???????°??????°?????????
            System.out.println(processMaccho(macchoNum, macchoList));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int processMaccho(int macchoNum,String[] macchoList) {
    		// ???????????§????????°??????????????????
    		List<Integer> macchoPower = new ArrayList<Integer>();
    		List<Integer> macchoWeight = new ArrayList<Integer>();
    		for(int i = 0; i < macchoList.length / 2; i++) {
    			int macchoPowerNum = Integer.valueOf(macchoList[i]);
    			int macchoWeightNum = Integer.valueOf(macchoList[i+1]);
    			macchoPower.add(macchoPowerNum);
    			macchoWeight.add(macchoWeightNum);
    		}
    		int cntMinMaccho = minMaccho(macchoPower, macchoWeight);
    		return cntMinMaccho;
    }
    
    private static int minMaccho(List<Integer> macchoPower, List<Integer> macchoWeight) {
    		int cnt = 0;
    		for(int i = 0; i + 1 < macchoPower.size(); i++) {
    			for(int j = 0; j + 1 < macchoWeight.size(); j++) {
    				int firstMacchoPower = macchoPower.get(i);
        			int firstMacchoWeight = macchoWeight.get(j);
        			int secondMacchoPower = macchoPower.get(j);
        			int secondMacchoWeight = macchoWeight.get(j+1);
        			if(firstMacchoPower > secondMacchoWeight) {
        				firstMacchoWeight += secondMacchoWeight;
        				macchoWeight.set(j, firstMacchoWeight);
        				macchoPower.remove(i+1);
        				macchoWeight.remove(j+1);
        				cnt++;
        			}
        			if(secondMacchoPower > firstMacchoWeight) {
        				secondMacchoWeight += firstMacchoWeight;
        				macchoWeight.set(j+1, secondMacchoWeight);
        				macchoPower.remove(i);
        				macchoWeight.remove(j);
        				cnt++;
        			}
    			}
    		}
    		if(cnt != 0) {
    			minMaccho(macchoPower, macchoWeight);
    		}
    		int minMacchoNum = macchoPower.size();
    		return minMacchoNum;
    }
}