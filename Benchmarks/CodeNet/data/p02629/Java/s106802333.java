import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
    //n--;
    long i = 0;
    ArrayList<Long> name = new ArrayList<Long>();

    //String base26 = Integer.toString(n-1, 26);

    while(n > 0) {
      long tmp = n % 26;
      n /= 26;
      /*if(i==0){
        tmp++;
      }*/
      tmp += 96;
      name.add(tmp);
      i++;
    }

    //listから配列へ変換(int)
    long[] hoge = new long[name.size()];
    for(int j=0; j<name.size();j++) {
      hoge[j] = name.get(j);
    }
    //System.out.println(name.get(0));
    //System.out.println(hoge[0]);

    String[] ansname =new String[name.size()];
    //数値をストリングに変換して， 文字列配列にいれる
    for(int j=0; j<name.size();j++) {
      String ans = Character.toString((char) hoge[j]);
      ansname[name.size()-j-1] = ans;
    }
    for(int j=0; j<name.size();j++) {
      System.out.print(ansname[j]);
    }
	}
}
