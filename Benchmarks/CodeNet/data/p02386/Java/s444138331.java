import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static String[][] a;
    static String temp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt(); //サイコロの個数
        a = new String[count][6];
        for (int i=0; i<count; i++) {
            for (int j=0; j<6; j++) {
                a[i][j] = sc.next();
            }
        }
        char[] c = {'E','E','E','N','W','W','W','S'};
        boolean flag = false;
        for(int i=0; i<3; i++){
            for(char e:c) {
                    shuffle(e);
                    for (int j=1; j<count; j++) {
                        if (Arrays.equals(a[0], a[j])){
                            flag=true;
                            break;
                        }
                    }
            }
        }
        if(flag) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

    public static void shuffle(char c) {
        switch (c) {
		case 'E':
			temp = a[0][0];
			a[0][0] = a[0][3];
			a[0][3] = a[0][5];
			a[0][5] = a[0][2];
			a[0][2] = temp;
			break;
		case 'N':
			temp = a[0][0];
			a[0][0] = a[0][1];
			a[0][1] = a[0][5];
			a[0][5] = a[0][4];
			a[0][4] = temp;
			break;
		case 'W':
			temp = a[0][0];
			a[0][0] = a[0][2];
			a[0][2] = a[0][5];
			a[0][5] = a[0][3];
			a[0][3] = temp;
			break;
		default:
			temp = a[0][0];
			a[0][0] = a[0][4];
			a[0][4] = a[0][5];
			a[0][5] = a[0][1];
			a[0][1] = temp;
			break;
		}
    }
}

