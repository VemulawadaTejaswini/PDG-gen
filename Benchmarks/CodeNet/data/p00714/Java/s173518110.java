import java.util.Scanner;

public class Main
{
  private static class Cell
  {
    public int xl, xr, h;
    public int value;
    public Cell l, r;

    public Cell(int xl_, int xr_, int h_)
    {
      xl = xl_;
      xr = xr_;
      h = h_;
    }

    public void part(int x, int h)
    {
      if (isLeaf())
      {
        l = new Cell(xl, x, h);
        r = new Cell(x, xr, h);
      }
      else if (x < l.xr)
      {
        l.part(x, h);
      }
      else if (r.xl < x)
      {
        r.part(x, h);
      }
    }

    public boolean isLeaf() { return l == null && r == null; }

    public int bottomArea() { return (xr - xl) * 30; }

    public boolean isFull() { return value == maxCapacity(); }

    public void fill() { value = maxCapacity(); }

    public int maxCapacity() { return h * bottomArea(); }

    public int capacity() { return maxCapacity() - value; }

    public void clear()
    {
      value = 0;
      if (!isLeaf())
      {
        l.clear();
        r.clear();
      }
    }

    public int water(int x, int v)
    {
      int cap = capacity();

      if (cap <= v)
      {
        if (!isLeaf())
        {
          l.fill();
          r.fill();
        }
        value += cap;
        return v - cap;
      }

      if (isLeaf())
      {
        value += v;
      }
      else
      {
        int rem = 0;
        if (x < l.xr)
        {
          rem = l.water(x, v);
          if (l.isFull() && rem != 0)
          {
            rem = r.water(r.xl + 1, rem);
          }
        }
        else if (r.xl < x)
        {
          rem = r.water(x, v);
          if (r.isFull() && rem != 0)
          {
            rem = l.water(l.xr - 1, rem);
          }
        }
        value = l.value + r.value + rem;
      }
      return 0;
    }

    public double getWaterHeight(int x)
    {
      if (isLeaf() || (l.isFull() && r.isFull()))
      {
        return (double)value / bottomArea();
      }
      else if (x < l.xr)
      {
        return l.getWaterHeight(x);
      }
      else if (r.xl < x)
      {
        return r.getWaterHeight(x);
      }
      return -1;
    }
  }

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int D = sc.nextInt();
    for (;D-->0;)
    {
      int N = sc.nextInt();

      int[] div = new int[50 + 1];
      for (int i = 0; i < N; i++)
      {
        int x = sc.nextInt(), h = sc.nextInt();
        div[h] = x;
      }

      Cell root = new Cell(0, 100, 50);
      for (int h = 50; h > 0; h--)
      {
        if (div[h] > 0) root.part(div[h], h);
      }

      int M = sc.nextInt();
      int[][] flow = new int[M][2];
      for (int i = 0; i < M; i++)
      {
        int x = sc.nextInt();
        int a = sc.nextInt();
        flow[i][0] = x;
        flow[i][1] = a;
      }

      int L = sc.nextInt();
      for (int i = 0; i < L; i++)
      {
        root.clear();
        int x = sc.nextInt();
        int t = sc.nextInt();
        for (int j = 0; j < M; j++)
        {
          root.water(flow[j][0], t * flow[j][1]);
        }
        System.out.printf("%.5f\n", root.getWaterHeight(x));
      }
    }
  }
}