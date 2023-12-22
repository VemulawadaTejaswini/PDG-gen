import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] in = null;
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> resultHit = new ArrayList<>();
        ArrayList<Integer> resultBlow = new ArrayList<>();
        //ArrayList<Integer> b = new ArrayList<>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int rawNumber = 0;
        int hit = 0, blow = 0;
        String line = null;
        try {
            while ((line = input.readLine()) != null) {
                rawNumber++;
                in = line.split(" ");
                if (rawNumber % 2 == 1) { //odd raws
                    for (int i = 0; i < 4; i++) {
                        a.add(Integer.parseInt(in[i]));
                    }
                } else {
                    for (int i = 0; i < 4; i++) { //index of b
                        for (int j = 0; j < a.size(); j++){ //index of a
                            if(Integer.parseInt(in[i]) == a.get(j)){ //hit or blow
                                if(i == j){
                                    hit++;
                                } else{
                                    blow++;
                                }
                            }
                        }
                    }
                    resultHit.add(hit);
                    resultBlow.add(blow);
                    hit = 0;
                    blow = 0;
                    a.clear();
                }
            }
        } catch (NumberFormatException e) {
            System.out.println(line + "include not int");
        } catch (IOException e) {
            System.out.println("IOException");
        }

        for(int i = 0; i < resultHit.size(); i++){
            System.out.println(resultHit.get(i) + " " + resultBlow.get(i));
        }
    }
}
