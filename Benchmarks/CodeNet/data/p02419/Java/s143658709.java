import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String w = sc.nextLine();//キーワード
        String t;
        String str = "";
        String end ="END_OF_TEXT";
        String check ="";
        
        int i;
        int j;
        int count=0;
        
//        ArrayList<String> strArray = new ArrayList<String>();
 //       int last =array.indexOf(end)
 //       int empty =array.indexOf();
        while(sc.hasNextLine()){
            t = sc.nextLine();
 //           strArray.add(sc.next());
//            String[] strArrayArray = sc.next();
            if(end.equals(t)){
                break;
            }else{
            str = str + " " +t;
            }
        }
//  System.out.print("&" + str);
  
 //       strArray.add() = str.split(" ");
        String[] strArray = str.split(" ");
//while(empty != -1);
//        for(i = 0; i < strArray.size(); i++){
        //System.out.println("&" + strArray.length);
        for(i = 0; i < strArray.length; i++){
//                 System.out.println("#"+strArray[i]);
            if(w.equalsIgnoreCase(strArray[i])){   
 //                System.out.println("@"+strArray[i]);
//                for(j=0; j < w.length(); j++){
//                    check += strArray[i+j];
//                        System.out.println(check);
//                    }if(w.equalsIgnoreCase(check)){
                        count++;
//                        i+=w.length()-1;
 //                            System.out.println("@"+check);
                    }
//                    check = "";
        }System.out.println(count);
    }
}




