import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] array = s.split("");
        
        int start = 0;
        int end = 0;
        for(int i = 0; i < s.length(); i++){
            String a = array[i];
            if(a.equals("A")){
                start = i;
                break;
            }
        }
        for(int i = start; i < s.length(); i++){
            String b = array[i];
            if(b.equals("Z")){
                end = i;
            }
        }

        System.out.println(end-start+1);
        
    }
}