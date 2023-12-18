import java.util.*;
class Main {
  static public void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    var wrapper = new Object(){int cnt = 0; int max = 0;};
    str.chars().mapToObj(c -> (char)c).forEach(x -> {
      if( x == 'R'){
        wrapper.cnt++;
      }else{
        wrapper.max = wrapper.max < wrapper.cnt ? wrapper.cnt : wrapper.max;
        wrapper.cnt = 0;
      }
    });
    wrapper.max = wrapper.max < wrapper.cnt ? wrapper.cnt : wrapper.max;
    System.out.println(wrapper.max);
  }
}