import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            int n=sc.nextInt();
            int r=sc.nextInt();
            if(n==0 && r==0) break;
            int[] card=new int[n];
            for(int i=0;i<n;i++) card[i]=i;
            for(int i=0;i<r;i++){
                int p=sc.nextInt();
                int c=sc.nextInt();
                int[] newcard=new int[n];
                for(int j=0;j<n-p-c+1;j++) newcard[j]=card[j];
                for(int j=n-p-c+1;j<n-c;j++) newcard[j]=card[c+j];
                for(int j=n-c;j<n;j++) newcard[j]=card[j-p+1];
                card=newcard;
            }
            System.out.println(card[n-1]+1);
        }
    }
}
