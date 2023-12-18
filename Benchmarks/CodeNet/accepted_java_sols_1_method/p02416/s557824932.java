import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] s;
        int[] A;
        s = new String[10000];
        A = new int[1000];

        int i, j, k;

        i=0;
        while(true){

            s[i] = sc.next();
            if(s[i].equals("0")){break;}

            i++;
        }

        for(k=0;k<i;k++){
            for(j=0;j<s[k].length();j++){

                A[k] += s[k].charAt(j) - '0';
            }
            System.out.println(A[k]);
        }

    }
}

