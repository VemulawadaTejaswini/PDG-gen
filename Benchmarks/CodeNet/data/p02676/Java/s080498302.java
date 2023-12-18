public class Main {
 public static void main(String[] a) {
   Scanner in = new Scanner(System.in);
   int k = in.nextInt();
   String s = in.next();
   String result = "";
   if (s.length() > k) {
     result = s.substring(0, k) + "...";
   }
   else {
     result = s;
   }
   return result; 
 }
}