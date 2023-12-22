import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String[] a=new String[555555];
        int i=0;
        while(true){
            a[i]=scan.next();
            if(a[i].equals("0")) break;
            i++;
        }

        
        i=0;

        while(true){
            if(a[i].equals("0")) break;
            int ans=0;
            for(int j=0;j<a[i].length();j++){
                ans+=Integer.parseInt(a[i].substring(j,j+1));
                //System.out.printf(":"+ans+":");
            }
            System.out.println(ans);
            i++;
        }
    }
}
