import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int heart[] = new int[13];
        int diamond[] = new int[13];
        int club[] = new int[13];
        int spades[] = new int[13];
        int n = sc.nextInt();
        int t;
        String c;
        for(int i=0;i<n;i++){
        	c = sc.next();
        	t = sc.nextInt();
        	if(c.equals("S"))spades[t-1]=t;
        	else if(c.equals("H"))heart[t-1]=t;
        	else if(c.equals("D"))diamond[t-1]=t;
        	else if(c.equals("C"))club[t-1]=t;
        	else System.out.println("EEE");
        }

        for(int i=0;i<13;i++)if(spades[i]==0)System.out.println("S "+(i+1));
        for(int i=0;i<13;i++)if(heart[i]==0)System.out.println("H "+(i+1));
        for(int i=0;i<13;i++)if(club[i]==0)System.out.println("C "+(i+1));
        for(int i=0;i<13;i++)if(diamond[i]==0)System.out.println("D "+(i+1));
        sc.close();
    }

}

