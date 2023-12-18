import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<Integer> X = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> sortedX = new ArrayList<>(X);
        sortedX.sort(null);

        for(Integer v : X){
            int idx = Collections.binarySearch(sortedX, v);
            if(idx < N / 2){
                bw.write(String.format("%d\n", sortedX.get(N / 2)));
            }else{
                bw.write(String.format("%d\n", sortedX.get(N / 2 - 1)));
            }
        }

        bw.flush();
    }
}