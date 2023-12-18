import java.util.*;
public class Main{
  public static void main(String []args){
  Scanner sc = new Scanner(System.in);

  int[] data = new int[3];
  int count = 0;

  for (int i = 0;i<3 ;i++ ) {
    data[i] = sc.nextInt();
  }

  Arrays.sort(data);

  for (int i = 0;i<2 ;i++ ) {
    for (;data[i]<data[2]-1 ; ) {
        count++;
        data[i] +=2;
    }
  }
  if ((data[2]!=data[1])&&data[2]==data[0]) {
    System.out.println(count+2);
    System.exit(0);
  }else if (data[2]==data[1]&&data[2]!=data[0]) {
    System.out.println(count+2);
    System.exit(0);
  }else if (data[0]==data[1]&&data[2]==data[0]) {
    System.out.println(count);
    System.exit(0);
  }
  System.out.println(count+1);

  }
}
