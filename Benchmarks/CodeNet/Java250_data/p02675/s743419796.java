import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String seisu = sc.next();
        String matubi = "0";
        List<String> list = Arrays.asList(seisu.split(""));
        int index = seisu.length();
        matubi = list.get(index - 1);
        if(matubi.equals("3")){
            System.out.println("bon");
        }else if((matubi.equals("0"))||(matubi.equals("1"))||(matubi.equals("6"))||(matubi.equals("8"))){
            System.out.println("pon");
        }else{
            System.out.println("hon");
        }
    }
}
