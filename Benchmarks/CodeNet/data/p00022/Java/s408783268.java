import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {

        InputStreamReader sr = null;
        Scanner sc = null;
        int datasets = 0;
        List<Integer> list = new ArrayList<Integer>();
        int sum = 0;
        int max = 0;

        try {
            sc = new Scanner(sr = new InputStreamReader(System.in));

            while ((datasets = sc.nextInt()) != 0) {

                for (int i = 1; i <= datasets; i++) {

                    list.add(sc.nextInt());

                }

                max = list.get(0);

                for (int i = 0; i < list.size(); i++) {
                    for (int j = i; j < list.size(); j++) {

                        sum += list.get(j);
                        if (max < sum) {

                            max = sum;

                        }

                    }

                    sum = 0;

                }

                System.out.println(max);
                max = 0;
                list.removeAll(list);

            }

        } catch (NoSuchElementException e) {

        }

        finally {
            sr.close();
            sc.close();
        }

    }

}