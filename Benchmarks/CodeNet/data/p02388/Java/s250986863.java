class Main
{
  public static void main(String[] args) {
    System.out.println(new Main(Main.readInt(System.in)).cubic());
  }

  private static int readInt(java.io.InputStream in) {
    java.io.BufferReader reader = null;
    try {
      reader = new java.io.BufferedReader(new java.io.InputStreamReader(in));
      return Integer.parseInt(reader.readLine());
    } catch (java.io.IOException e) {
      e.printStackTrace();
    } finally {
      if (reader != null) {
        try {
          reader.close();
        } catch (java.io.IOException e) {
          e.printStackTrace();
        }
      }
    }
  }

  private final int x;
  private Main(int x) {
    this.x = x;
  }
  private int cubic() {
    return x * x * x;
  }
}