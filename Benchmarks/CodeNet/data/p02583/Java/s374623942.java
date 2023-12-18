import java.util.*;
import java.io.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int lengths[]=new int[n];
        for(int i=0;i<n;i++){
            lengths[i]=sc.nextInt();
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(lengths[i]!=lengths[j] && lengths[i]!=lengths[k] && lengths[j]!=lengths[k]){
                        int val1=lengths[i]+lengths[j];
                        int val2=lengths[j]+lengths[k];
                        int val3=lengths[i]+lengths[k];
                        if(val1>lengths[k] && val2>lengths[i] && val3>lengths[j]){
                            cnt++;
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}