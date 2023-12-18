import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        List<String> list = new ArrayList<String>();

        while(true){
            String text = sc.next();
            
            if(text.equals("-")){
                break;
            }
            int m = sc.nextInt();
            for(int i = 0; i < m; i++){
                int j = sc.nextInt();
                text = text.substring(j, text.length()) + text.substring(0, j);
            }

            list.add(text);
        }
        list.forEach(System.out::println);
    }
}
