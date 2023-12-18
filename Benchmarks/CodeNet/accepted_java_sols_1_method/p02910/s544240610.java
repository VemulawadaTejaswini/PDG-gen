import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.next().split("");
        String res = "Yes";

        for(int i=0;i<a.length;i++){
            if(i%2==1){
                if(a[i].equals("R"))res="No";
            }
            else{
                if(a[i].equals("L"))res="No";
            }
        }
        System.out.println(res);

    }
}