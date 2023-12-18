import java.util.*;
//import java.util.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    String line;
    int i;
    Set<String> list = new HashSet<String>();
    //List<String> list = new ArrayList<>();
    String tmp[] = new String[2];
    
    for(i = 0; i < n; i++){
        line = sc.nextLine();
        //System.out.println(line);
        tmp = line.split(" ");
        
        if(tmp[0].equals("insert")){
            list.add(tmp[1]);
        }else if(tmp[0].equals("find")){
            if(list.contains(tmp[1])){
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

