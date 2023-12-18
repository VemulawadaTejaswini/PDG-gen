import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line;
            int macchoNum = 0;
            int cntMacchoNum = 0;
            int cntNum = 0;
            List<String> macchoList = new ArrayList<String>();
            while ((line = br.readLine()) != null) {
            	String[] strMacchoList = line.split(" ", 0);
            	if(cntMacchoNum != 0) {
            		macchoList.add(strMacchoList[0]);
            		macchoList.add(strMacchoList[1]);
            		cntNum++;
            	}
            	if(cntMacchoNum == 0) {
            		macchoNum = Integer.valueOf(strMacchoList[0]);
            		cntMacchoNum++;
            	}
            	
            	if(cntMacchoNum != 0 && macchoNum == cntNum) {
            		//??????????????§???????°??????°?????????
            		System.out.println(processMaccho(macchoNum, macchoList));
            		cntNum = 0;
            		cntMacchoNum = 0;
            		macchoList = new ArrayList<String>();
            	}
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int processMaccho(int macchoNum,List<String> macchoList) {
    		// ???????????§????????°??????????????????
    		List<Integer> macchoPower = new ArrayList<Integer>();
    		List<Integer> macchoWeight = new ArrayList<Integer>();
    		for(int i = 0; i+1 < macchoNum; i++) {
    			int macchoPowerNum = Integer.valueOf(macchoList.get(i));
    			int macchoWeightNum = Integer.valueOf(macchoList.get(i+1));
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