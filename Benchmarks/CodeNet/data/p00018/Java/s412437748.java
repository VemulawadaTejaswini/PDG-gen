import java.util.Scanner;
public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int oldArray[] = new int[5];
        int t;
        for (int i=0; i<5; i++) {
            int a = scan.nextInt();
            oldArray[i] = a;
        }
        for (int j=0; j<4; j++){
            for (int m=0; m<4-j;m++)
            if (oldArray[m]<oldArray[m+1]){
                t = oldArray[m];
                oldArray[m] = oldArray[m+1];
                oldArray[m+1] = t;
            }
        }
        String delim = "";
        StringBuilder oo = new StringBuilder();
        for (int i=0; i<5; i++) {
            oo.append(delim).append(oldArray[i]);
            delim = " ";
        }
        System.out.println(oo);
    }