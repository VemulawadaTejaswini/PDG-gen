import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int total1 = inp.nextInt();

        int[] list1 = new int[total1];

        for(int i = 0; i < total1; i++){
            list1[i] = inp.nextInt();
        }

        int total2 = inp.nextInt();

        int[] list2 = new int[total2];

        for(int i = 0; i < total2; i++) {
            list2[i] = inp.nextInt();
        }

        int same = 0;

        ArrayList<Integer> sameList = new ArrayList<>();

        if (total2 < total1) {
            for(int i = 0; i < total2; i++) {
                for(int j = 0; j < total1; j++){
                    if (list1[j] == list2[i]) {
                        if (!(sameList.contains(list2[i]))) {
                            sameList.add(list2[i]);
                            same++;
                        }
                    }
                }
            }
        } else {
            for(int i = 0; i < total1; i++){
                for(int j = 0; j < total2; j++){
                    if (list2[j] == list1[i]) {
                        if (!(sameList.contains(list1[i]))) {
                            sameList.add(list1[j]);
                            same++;
                        }
                    }
                }
            }
        }

        System.out.println(same);
    }
}

