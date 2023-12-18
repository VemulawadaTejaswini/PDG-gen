import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[][] dataSet = new Integer[3000][2];
        int i=0;
        while(true) {
            int tmp1 = sc.nextInt();
            int tmp2 = sc.nextInt();

            dataSet[i][0] = tmp1;
            dataSet[i][1] = tmp2;
            i++;

            if(tmp1 == 0 && tmp2 == 0) {
                break;
            }
        }

        for(int j=0; j<dataSet.length; j++) {
            if(dataSet[j][0] == 0 && dataSet[j][1] == 0) {
                break;
            }
            java.util.Arrays.sort(dataSet[j]);
            System.out.println(dataSet[j][0] + " " + dataSet[j][1]);
        }
    }
}

