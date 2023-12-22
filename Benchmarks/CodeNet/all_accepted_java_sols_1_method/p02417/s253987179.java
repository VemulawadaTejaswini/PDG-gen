import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String str ="";
        while(sc.hasNextLine()){
            String sentense = sc.nextLine();
            str += sentense;
        }
//         System.out.println(str + " : ");
        int length = str.length();
        int count = 0;
        int i;
        int j;
 //       char [] c = new char[str.length()];
        String abc ="abcdefghijklmnopqrstuvwxyz";
        
        String[] strArray = str.split("");
        String[] abcArray = abc.split("");
 //     while(sc.hasNextLine()){      
            for(i = 0; i < 26; i++){
                for(j = 0; j < length; j++){    
     //           char c = str.charAt(i);//一文字づつみていく
                  if(abcArray[i].equalsIgnoreCase(strArray[j])){
                    count++;
                  }
                }
     //             }else{
       //               System.out.print("");
         //         }
            System.out.println(abcArray[i] + " : "+count);
            count = 0;
                
//            }
      }
    }
}


