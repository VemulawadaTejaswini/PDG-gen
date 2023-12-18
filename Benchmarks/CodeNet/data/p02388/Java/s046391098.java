class Main
{
  public static void main(String[] args) {
    java.io.DataInputStream dis = null;
    try {
      dis = new java.io.DataInputStream(System.in);
      Main m = new Main(dis.readInt());
      dis.close();
      System.out.println(m.cubic());
    } catch (java.io.IOException ioe) {
      if (dis != null) {
        try {
          dis.close();
        } catch (Exception e) {
        }
      }
    }
  }

  private final int x;
  private Main(int x) {
    this.x = x;
  }
  public int cubic() {
    return x * x * x;
  }
}