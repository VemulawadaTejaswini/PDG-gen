import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        double[] array = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        Arrays.sort(array);

        double conbine = 0;
        for(int i = 0; i < array.length - 1; i++) {
            if(i == 0) {
                conbine = (array[i] + array[i + 1]) / 2;
            } else {
                conbine = (conbine + array[i + 1]) / 2;
            }

        }
        System.out.println(conbine);

    }
}