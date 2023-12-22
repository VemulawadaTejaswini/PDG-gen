import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] in = sc.next().toCharArray();
        List<String> out = new ArrayList<>();
        String kotae = "";
        for(int i = 0; i < in.length; i++){
            char b01 = in[i];
            if(b01 == '0'){
                out.add(out.size(),"0");
            }
            else if(b01 == '1'){
                out.add(out.size(),"1");
            }
            else if(b01 == 'B'){
                if(out.size() == 0){
                }
                else {
                    out.remove(out.size() - 1);
                }
            }
        }

        for(int i = 0; i < out.size(); i++){
            String s = out.get(i);
            kotae = kotae + s;
        }
        System.out.println(kotae);
    }
}
