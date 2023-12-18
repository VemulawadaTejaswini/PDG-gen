import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aNum = Integer.parseInt(sc.nextLine());
        int[] aCollection = new int[aNum];
        
        String line = sc.nextLine();
        String[] linesp = new String[aNum];
        linesp=line.split(" ");
        
        for(int i=0;i<aNum;i++){
        	aCollection[i]=Integer.parseInt(linesp[i]);
        }
        
        int mNum = Integer.parseInt(sc.nextLine());
        int[] mCollection = new int[mNum];
        
        String line2 = sc.nextLine();
        String[] line2sp = new String[mNum];
        line2sp=line2.split(" ");
        
        for(int i=0;i<mNum;i++){
        	mCollection[i]=Integer.parseInt(line2sp[i]);
        }
        
        int comSum = (int)Math.pow(2.0, (double)aNum);
        
        String[] command = new String[comSum];
        
        for(int i=0;i<comSum;i++){
        	String com = Integer.toBinaryString(i);
        	
        	int length0 = aNum-com.length();
        	for(int j=0;j<length0;j++){
        		com = "0"+com;
        	}        	
        	command[i]=com;
        }
        
        for(int i=0;i<mNum;i++){
        	
        	int flag=-1;
        	
        	for(int j=0;j<comSum;j++){
        		String[] comAct = new String[aNum];
        		comAct=command[j].split("");
        		int sum=0;
        		for(int k=0;k<aNum;k++){
        			if(comAct[k].equals("1")){
        				sum+=aCollection[k];
        			}
        		}
        		
        		if(sum==mCollection[i]){
        			flag=1;
        		}
        		
        	}
        	
        	if(flag==1){
        		System.out.println("yes");
        	}else{
        		System.out.println("no");
        	}
        }
    }
}