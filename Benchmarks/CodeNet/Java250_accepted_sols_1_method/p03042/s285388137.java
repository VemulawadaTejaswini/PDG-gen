import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] SH = S.split("");
        String Kotae;
        String SHaM = SH[0]+SH[1];
        String SHbM = SH[2]+SH[3];
        int SHa= Integer.parseInt(SHaM);
        int SHb= Integer.parseInt(SHbM);
        if(SHa==00 || SHa>=13){
            if(SHb==00 || SHb>=13){
                Kotae = "NA";
            }else{
                Kotae = "YYMM";
            }
        }else{
            if(SHb==00 || SHb>=13){
                Kotae = "MMYY";
            }else{
                Kotae = "AMBIGUOUS";
            }
        }
        System.out.println(Kotae);
    }
}