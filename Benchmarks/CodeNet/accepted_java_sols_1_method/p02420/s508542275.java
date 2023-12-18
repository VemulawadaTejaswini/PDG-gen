import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            String line = sc.next();
            if(line.equals("-")) System.exit(0);
            int l = line.length();
            char[] moji = new char[l];
            for(int i=0;i<l;i++){
                moji[i] = line.charAt(i);
            }

            int m = sc.nextInt();
            for(int i=0;i<m;i++){
                char[] moji2 = new char[l];
                int h = sc.nextInt();
                for(int j=0;j<l-h;j++){
                    moji2[j] = moji[h+j];
                }
                for(int j=0;j<h;j++){
                    moji2[l-h+j] = moji[j];
                }
                for(int j=0;j<l;j++){
                    moji[j] = moji2[j];
                }
            }
            for(int k=0;k<l;k++){
                System.out.print(moji[k]);
            }
            System.out.println("");
        }
    }
}
