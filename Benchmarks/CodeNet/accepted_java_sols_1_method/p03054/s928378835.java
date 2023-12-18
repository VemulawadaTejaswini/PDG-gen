import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        int n=sc.nextInt();
        int ph=sc.nextInt();
        int pw=sc.nextInt();
        String s[]=sc.next().split("",0);
        String s2[]=sc.next().split("",0);
        boolean po=true;
        int pcopyw=pw;
        for(int i=0;i<n;i++){
            if(s[i].equals("R")){
                pcopyw++;
            }
            if(pcopyw>w){po=false;
                break;
            }
            if(s2[i].equals("L")&&pcopyw>1){
                pcopyw--;
            }
        }
        pcopyw=pw;
        for(int i=0;i<n&&po;i++){
            if(s[i].equals("L")){
                pcopyw--;
            }
            if(pcopyw<=0){po=false;
                break;
            }
            if(s2[i].equals("R")&&pcopyw<w){
                pcopyw++;
            }
        }
        int pcopyh=ph;
        for(int i=0;i<n&&po;i++){
            if(s[i].equals("D")){
                pcopyh++;
            }
            if(pcopyh>h){po=false;
                break;
            }
            if(s2[i].equals("U")&&pcopyh>1){
                pcopyh--;
            }
        }
        pcopyh=ph;
        for(int i=0;i<n&&po;i++){
            if(s[i].equals("U")){
                pcopyh--;
            }
            if(pcopyh<=0){po=false;
                break;
            }
            if(s2[i].equals("D")&&pcopyh<h){
                pcopyh++;
            }
        }
        System.out.println(po?"YES":"NO");
    }
}
