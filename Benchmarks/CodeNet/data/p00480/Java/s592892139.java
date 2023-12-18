import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	private static int answer=0;
	private static long gou=0;
	private static int[] num;
	
	private static void calc(int n,int sum){
		if(n==num.length){
			if(answer==sum){
				gou++;
			}
			return;
		}
		if(sum<0||sum>20){
			return;
		}
		int store=sum;
		store+=num[n];
		calc(n+1,store);
		sum-=num[n];
		calc(n+1,sum);
	}
	
	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int length=0,i=0,sum=0;
            String ring1="";
            boolean first=true;
            
            while ((line = br.readLine()) != null) {
	            length=Integer.parseInt(line);
	            String[] n=br.readLine().split(" ");
	            num=new int[length-1];
	            for(int j=0;j<length-1;j++){
	            	num[j]=Integer.parseInt(n[j]);
	            }
	            answer=Integer.parseInt(n[length-1]);
	            calc(0,0);
	            break;
            }
            System.out.println(gou);
        }
    }

}