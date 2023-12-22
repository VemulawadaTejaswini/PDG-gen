import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i=0;i<n;++i) a[i] = sc.nextInt();

        count = 1;
        int last = 1;
        for (int i=0;i<n;++i)
        {
            if (count == a[i])
            {
                last = a[i];
                ++count;
            }else
            {
                a[i] = -1;
            }
        }

        List<Integer> b = new ArrayList<>();
        //if (count - 1 != a[a.length-1]) System.out.println(-1);
        if (count - 1 != last) System.out.println(-1);
        else
        {
            for (int i=0;i<n;++i)  if (a[i] != -1) b.add(a[i]);
            System.out.println(a.length - b.size());
        }

        sc.close();
    }

    public class Pair<F,S>
    {
        private final F first;
        private final S second;

        Pair(F first,S second)
        {
            this.first = first;
            this.second = second;
        }

        public void print() { System.out.println("("+this.first+","+this.second+")"); }

        //get
        public F first() {return this.first;}
        public S second() {return this.second;}

        @Override
        public boolean equals(Object object)
        {
            if (object instanceof Pair)
            {
                Pair pair = (Pair)object;
                return this.first==pair.first && this.second==pair.second;
            }else
            {
                return false;
            }
        }

        @Override
        public int hashCode()
        {
            return Objects.hash(first,second);
        }
    }
}