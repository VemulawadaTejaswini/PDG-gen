import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
 
        Scanner sc = new Scanner(System.in);
        
        int gameNum = sc.nextInt();//GAMEする回数

//        System.out.println(gameNum);

        int pointTaro = 0;
        int pointHanako = 0;
    
//    while(sc.hasNextLine()){    
        for(int i = 0; i < gameNum; i++){
 
            String cardTaro = sc.next();
            String cardHanako = sc.next();
              //     System.out.println(cardTaro + " T" + cardHanako);
              //     System.out.println(pointTaro + " H" + pointHanako); 

            if(cardTaro.compareTo(cardHanako) > 0){
                pointTaro += 3;
            }
            if(cardTaro.compareTo(cardHanako) < 0){
                pointHanako += 3;
            }
            if(cardTaro.compareTo(cardHanako) == 0){
                pointTaro += 1;
                pointHanako += 1;
            }
//            System.out.println(cardTaro + " @" + cardHanako);
//            System.out.println(pointTaro + " #" + pointHanako);
        }
        System.out.println(pointTaro + " " + pointHanako);
    }
}


