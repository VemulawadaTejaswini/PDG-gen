import java.io.*;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(br.ready()) {
           String[] grades  = br.readLine().split(" ");
           int exam1 = Integer.valueOf(grades[0]);
           int exam2 = Integer.valueOf(grades[1]); 
           int examTotal = exam1 + exam2;
           int reExam    = Integer.valueOf(grades[2]);
           String clas  = null;
           if(exam1 == -1 && exam2 == -1 && reExam == -1 ) break;
           if(exam1 == -1 | exam2 == -1 ) {
              clas = "F";
           }
           else {
               clas  =  examTotal >= 80 ? "A" : 
               examTotal >= 65 & examTotal < 80 ? "B" :
               examTotal >= 50 & examTotal < 65 ? "C" :
               examTotal >= 30 & examTotal < 50 ? reExam >= 50 ? "C" : "D" :
               examTotal <  30 ? "F" : null;
           }
           System.out.println(clas);
        }
    }
}
     
           
        
