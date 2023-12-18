import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        if(k%2==0){
            System.out.println(-1);
            return;
        }
        int temp=k;
        int count=0;
        while(temp!=0){
            temp=temp/10;
            count++;
        }

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<count;i++)
            sb.append('7');

        long num=Integer.parseInt(sb.toString());
        
        int res=1;
        while(num%k!=0){
            long rem=num%k;
            res++;
            num=rem*10+7;
        }
        System.out.println(res+count-1);
    }
}