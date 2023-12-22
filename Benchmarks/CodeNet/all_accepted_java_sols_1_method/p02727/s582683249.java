import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int y = scan.nextInt();

    int a1 = scan.nextInt();
    int b1 = scan.nextInt();
    int c1 = scan.nextInt();

    ArrayList<Integer> a = new ArrayList<Integer>();
    ArrayList<Integer> b = new ArrayList<Integer>();
    ArrayList<Integer> c = new ArrayList<Integer>();

    for (int i=0;i<a1;i++){
      a.add(scan.nextInt());
    }

    for (int i=0;i<b1;i++){
      b.add(scan.nextInt());
    }

    for (int i=0;i<c1;i++){
      c.add(scan.nextInt());
    }

    Collections.sort(a,Collections.reverseOrder());
    Collections.sort(b,Collections.reverseOrder());
    Collections.sort(c,Collections.reverseOrder());

    long[] a2 = new long[a1+1];
    long[] b2 = new long[b1+1];
    long[] c2 = new long[c1+1];

    for (int j=0;j<a1;j++){
      a2[j+1] = a2[j] + a.get(j);
    }

    for (int j=0;j<b1;j++){
      b2[j+1] = b2[j] + b.get(j);
    }

    for (int j=0;j<c1;j++){
      c2[j+1] = c2[j] + c.get(j);
    }

    long sum = 0;

    int change = 0;
    while ( (x-1-change>=0) && (change<c1) && (c.get(change) >= a.get(x-1-change))){
      change += 1;
    }

    sum += c2[change] + a2[x-change];

    ArrayList<Integer> dd = new ArrayList<Integer>();
    for (int i=change;i<c1;i++){
      dd.add(c.get(i));
    }

    for (int i=0;i<change;i++){
      dd.add(a.get(x-change+i));
    }

    for (int i=0;i<b1;i++){
      dd.add(b.get(i));
    }

    Collections.sort(dd,Collections.reverseOrder());
    long[] ggg = new long[y+1];
    for (int i=0;i<y;i++){
      ggg[i+1] = ggg[i] + dd.get(i);
    }

    sum += ggg[y];
    System.out.println(sum);

  }

}
