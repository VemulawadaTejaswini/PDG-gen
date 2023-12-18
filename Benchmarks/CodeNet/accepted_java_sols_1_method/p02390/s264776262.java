import java.util.Scanner; 
class Main {
   public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     int x = scan.nextInt();
     int hours = x / (60 * 60);
     int y = x - (hours * 60 * 60);
     int min = y / 60;
     int sec = y - (min * 60);
     System.out.println(hours + ":" + min + ":" + sec);
  }
}
