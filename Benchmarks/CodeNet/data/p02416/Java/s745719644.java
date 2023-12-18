import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int sum=0;
        	String x=sc.next();
            int n=x.length();
            int[] num = new int[n];
        	if(x.equals("0"))
                break;
            
            String[] str = x.split("");
            for(int i=0;i<n;i++){
                sum+=Integer.parseInt(str[i]);
            }
            System.out.println(sum);
        }       
    }
}

