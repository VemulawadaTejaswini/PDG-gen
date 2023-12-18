import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer>array = new ArrayList<Integer>();
        while(true){
            String input =  sc.next();
            String[] ranks =  input.split(",");
            if(ranks[0].equals(ranks[1]) && ranks[0].equals("0")){
                break;
            }else{
                array.add(Integer.parseInt(ranks[1]));
            }
        }
        while(sc.hasNext()){
            int address = sc.nextInt();
            int requestedScore = array.get(address);
            int count = 0;
            for(int i = 0; i < array.size(); i++){
                if(requestedScore < array.get(i)){
                    count++;
                }
            }
            System.out.println(array.size() - count);
           
        }
        sc.close();
    }
}
