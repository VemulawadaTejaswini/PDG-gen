import java.util.Scanner
public static void main(String[]args) {
  Scanner sc = new Scanner(System.in);
  int distance = sc.nextInt();
  int meetingTime = sc.nextInt();
  int speed = sc.nextInt();
  int time = speed / distance;
 
 if(meetingTime >= time) {
 	 System.out.println("Yes");
  } else if(meetingTime < time) {
 	 System.out.println("No");
  }
  
  
  
  