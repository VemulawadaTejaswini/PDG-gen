import java.util.Scanner;

import static java.util.Arrays.sort;

public class Main {
    public  static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i< t; i++){
            int[] num = new int[9];
            String[] col = new String[9];

            for(int j = 0; j < 9; j++)
                num[j] = sc.nextInt();
            for(int j = 0; j < 9; j++)
                col[j] = sc.next();

            int countR = 0;
            int countG = 0;
            int countB = 0;

            int[] numred = null, numgrn = null, numblue = null;

            for(int j = 0; j < 9; j++){
                if(col[j].equals("R"))
                    countR++;
                else if(col[j].equals("G"))
                    countG++;
                else
                    countB++;
            }

            if(countR % 3 !=0 && countG % 3 != 0 && countB % 3 != 0){
                System.out.println("0");
                continue;
            }

            if(countR != 0){
                numred = new int[countR];
                int indexnum = 0;
                for(int j = 0; j < 9; j++){
                    if(col[j].equals("R"))
                        numred[indexnum++] = num[j];
                }
                sort(numred);
            }

            if(countG != 0){
                numgrn = new int[countG];
                int indexnum = 0;
                for(int j = 0; j < 9; j++){
                    if(col[j].equals("G"))
                        numgrn[indexnum++] = num[j];
                }
                sort(numgrn);
            }

            if(countB != 0){
                numblue = new int[countB];
                int indexnum = 0;
                for(int j = 0; j < 9; j++){
                    if(col[j].equals("B"))
                        numblue[indexnum++] = num[j];
                }
                sort(numblue);
            }

            if(countR == 3){
                if((numred[0] == numred[1] && numred[1] == numred[2]) || (numred[0] + 1 == numred[1] && numred[1] == numred[2] - 1)){

                }
                else{
                    System.out.println(0);
                    continue;
                }
            }
            if(countR == 6){
                if((numred[0] == numred[1] && numred[1] == numred[2] && numred[3] == numred[4] && numred[4] == numred[5]) || (numred[0] + 1 == numred[1] && numred[1] == numred[2] - 1 && numred[3] + 1 == numred[4] && numred[4] == numred[5] - 1)){

                }
                else{
                    System.out.println(0);
                    continue;
                }
            }
            if(countR == 9){
                if((numred[0] == numred[1] && numred[1] == numred[2] && numred[3] == numred[4] && numred[4] == numred[5] && numred[6] == numred[7] && numred[7] == numred[8]) || (numred[0] + 1 == numred[1] && numred[1] == numred[2] - 1 && numred[3] + 1 == numred[4] && numred[4] == numred[5] - 1 && numred[6] + 1 == numred[7] && numred[7] == numred[8] - 1)){

                }
                else{
                    System.out.println(0);
                    continue;
                }
            }
            
            if(countG == 3){
                if((numgrn[0] == numgrn[1] && numgrn[1] == numgrn[2]) || (numgrn[0] + 1 == numgrn[1] && numgrn[1] == numgrn[2] - 1)){

                }
                else{
                    System.out.println(0);
                    continue;
                }
            }
            if(countG == 6){
                if((numgrn[0] == numgrn[1] && numgrn[1] == numgrn[2] && numgrn[3] == numgrn[4] && numgrn[4] == numgrn[5]) || (numgrn[0] + 1 == numgrn[1] && numgrn[1] == numgrn[2] - 1 && numgrn[3] + 1 == numgrn[4] && numgrn[4] == numgrn[5] - 1)){

                }
                else{
                    System.out.println(0);
                    continue;
                }
            }
            if(countG == 9){
                if((numgrn[0] == numgrn[1] && numgrn[1] == numgrn[2] && numgrn[3] == numgrn[4] && numgrn[4] == numgrn[5] && numgrn[6] == numgrn[7] && numgrn[7] == numgrn[8]) || (numgrn[0] + 1 == numgrn[1] && numgrn[1] == numgrn[2] - 1 && numgrn[3] + 1 == numgrn[4] && numgrn[4] == numgrn[5] - 1 && numgrn[6] + 1 == numgrn[7] && numgrn[7] == numgrn[8] - 1)){

                }
                else{
                    System.out.println(0);
                    continue;
                }
            }

            if(countB == 3){
                if((numblue[0] == numblue[1] && numblue[1] == numblue[2]) || (numblue[0] + 1 == numblue[1] && numblue[1] == numblue[2] - 1)){

                }
                else{
                    System.out.println(0);
                    continue;
                }
            }
            if(countB == 6){
                if((numblue[0] == numblue[1] && numblue[1] == numblue[2] && numblue[3] == numblue[4] && numblue[4] == numblue[5]) || (numblue[0] + 1 == numblue[1] && numblue[1] == numblue[2] - 1 && numblue[3] + 1 == numblue[4] && numblue[4] == numblue[5] - 1)){

                }
                else{
                    System.out.println(0);
                    continue;
                }
            }
            if(countB == 9){
                if((numblue[0] == numblue[1] && numblue[1] == numblue[2] && numblue[3] == numblue[4] && numblue[4] == numblue[5] && numblue[6] == numblue[7] && numblue[7] == numblue[8]) || (numblue[0] + 1 == numblue[1] && numblue[1] == numblue[2] - 1 && numblue[3] + 1 == numblue[4] && numblue[4] == numblue[5] - 1 && numblue[6] + 1 == numblue[7] && numblue[7] == numblue[8] - 1)){

                }
                else{
                    System.out.println(0);
                    continue;
                }
            }
            System.out.println(1);
        }
        sc.close();

    }
}
