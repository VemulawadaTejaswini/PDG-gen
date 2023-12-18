import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i,a=0,n=0,min=0,max=0,sum=0;
        n=scan.nextInt();
        for(i=0;i<n;i++){
        	a=scan.nextInt();
        	sum+=a;
        	if(i==0){
        		min=max=a;
        	}
        	if(min>a){
        		min=a;
        	}
        	if(max<a){
        		max=a;
        	}
        }
        System.out.println(min+" "+max+" "+sum);
    }
}