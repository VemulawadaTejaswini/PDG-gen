import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tkMonsterHp = sc.nextInt();
    int tkMonsterAttack = sc.nextInt();
    int aoMonsterHp = sc.nextInt();
    int aoMonsterAttack = sc.nextInt();

    while (tkMonsterHp > 0 && aoMonsterHp > 0) {
      aoMonsterHp -= tkMonsterAttack;
      if(aoMonsterHp <= 0) {
        System.out.println("Yes");
        break;
      }

      tkMonsterHp -= aoMonsterAttack;

      if(tkMonsterHp <= 0) {
        System.out.println("No");
        break;
      }
      
    }
    sc.close();
  }
}