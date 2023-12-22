import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] a=new int[200];
        int[] b=new int[200];
        int i=0;
        while(true){
            a[i]=scan.nextInt();
            b[i]=scan.nextInt();
            if(a[i]==0&&b[i]==0) break;
            i++;
        }
        i=0;
        while(true){
            if(a[i]==0&&b[i]==0) break;
            int cnt=0;
            for(int j=1;j<a[i];j++){
                for(int k=j+1;k<a[i];k++){
                    if(b[i]-j-k>k&&b[i]-j-k<=a[i]) cnt++; 
                }
            }
            System.out.println(cnt);
            i++;

        }
    }
}
