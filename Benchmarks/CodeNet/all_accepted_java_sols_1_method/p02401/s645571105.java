import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<String> op = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        
        while(true){
            String[] line = br.readLine().split(" ");
            if ("?".equals(line[1])) {
                break;
            }
            a.add(Integer.parseInt(line[0]));
            op.add(line[1]);
            b.add(Integer.parseInt(line[2]));
        }
        for(int i=0;i<a.size();i++){
            if("+".equals(op.get(i))){
                System.out.println(a.get(i) + b.get(i));
            }else if("-".equals(op.get(i))){
                System.out.println(a.get(i) - b.get(i));
            }else if("*".equals(op.get(i))){
                System.out.println(a.get(i) * b.get(i));
            }else if("/".equals(op.get(i))){
                System.out.println(a.get(i) / b.get(i));
            }
        }
    }
}

