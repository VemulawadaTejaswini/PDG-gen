import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n;
        while((n=sc.nextInt())!=0){
            int[]a=new int[26];
            sc.nextLine();
            boolean frag=false;
            int sum=0,ind=0;
            char c[]=sc.nextLine().replace(" ","").toCharArray();
            for(int i=0;i<n;i++){
                c[i]=(char)(((int)c[i])-((int)'A'));
                a[c[i]]++;
                int[]po=a.clone();
                Arrays.sort(po);
                sum=po[26-1];
                if(po[26-1]-po[26-2]>(n-i-1)){
                    ind=i+1;
                    frag=true;
                    break;
                }
            }
            for(int i=0;i<26;i++){
                if(a[i]==sum){
                    sum=i;
                    break;
                }
            }
            if(frag)
            System.out.println(((char)(sum+((int)'A')))+" "+ind);
            else System.out.println("TIE");
        }
    }
}

