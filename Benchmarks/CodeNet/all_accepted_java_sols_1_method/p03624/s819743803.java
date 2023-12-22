import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        HashMap<Integer,Integer> c=new HashMap<>();
        String S=sc.next();
        for(int i=0;i<S.length();i++){
            c.put((int)S.charAt(i),1);
        }
        for(int i=(int)'a';i<=(int)'z';i++){
            if(!c.containsKey(i)){
                System.out.printf("%c",i);
                return;
            }
        }
        System.out.println("None");
    }
}