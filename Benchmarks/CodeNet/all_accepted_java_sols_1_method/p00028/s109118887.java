import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[]=new int[100];
        while(sc.hasNext()){
        	int n=sc.nextInt();
        	num[n-1]++;
        }
        int max=0;
        for(int i=0;i<num.length;i++){
        	if(max<num[i])max=num[i];
        }
        int ans[]=new int[100];
        int cnt=0;
        for(int i=0;i<num.length;i++){
        	if(max==num[i]){
        		ans[cnt]=i+1;
        		cnt++;
        	}
        }
        for(int i=0;i<cnt;i++){
        	System.out.println(ans[i]);
        }
    }
}