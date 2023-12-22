import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int turi = 10000 - sc.nextInt();
        int kt1=0;
        int kt2=0;
        int kt3=0;


        if(turi!=0) {
             kt1 = turi % 10; //1桁目
            turi = turi / 10;
        }
        if(turi!=0) {
             kt2 = turi % 10; //2桁目
            turi = turi / 10;
        }
        if(turi!=0) {
             kt3 = turi % 10; //3桁目
        }

        int ans = kt3*100+kt2*10+kt1;

        System.out.println(ans);
    }
}

