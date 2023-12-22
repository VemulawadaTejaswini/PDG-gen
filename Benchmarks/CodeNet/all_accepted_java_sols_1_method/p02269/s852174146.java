import java.util.*;
//import java.util.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    String action,word;
    int i;
    Set<String> list = new HashSet<String>();
    //List<String> list = new ArrayList<>();
    String tmp[] = new String[2];
    
    for(i = 0; i < n; i++){
        action = sc.next();
        word = sc.next();

        if(action.equals("insert")){
            list.add(word);
        }else if(action.equals("find")){
            if(list.contains(word)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }else{
            System.out.println("error");
        }
    }
//    System.out.println(list.get(1));
    

    }

}

