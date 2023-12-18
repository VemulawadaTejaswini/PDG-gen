import java.util.*;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n;
    int x;
    String[] s;
    Integer[] numbers;
    int sum;
    int numAnswers = 0;
    while (true) {
      s = sc.nextLine().split(" ");
      n = Integer.parseInt(s[0]); 
      x = Integer.parseInt(s[1]); 
      if (n == 0 && x == 0) {
        break;
      }
      numbers = new Integer[n];
      for (int i = 0; i < n; i++) {
        numbers[i] = i + 1;
      }
      Combinations<Integer> combinations = new Combinations<Integer>(numbers, 3);
      Iterator<List<Integer>> iterator = combinations.iterator();
      while(iterator.hasNext()) {
        List<Integer> p = iterator.next();
        sum = p.get(0) + p.get(1) + p.get(2);
        if (sum == x) {
          numAnswers++;
        }
      }
      System.out.println(numAnswers);
      numAnswers = 0;
    }
  }
}

class Combinations<T> implements Iterator{

  private List<List<T>> combinations;
  private List<T> list;
  private int[] index;
  private boolean[] visited;
  private int r;
  private Iterator<List<T>> iterator;

  public Combinations(T[] array, int r){
    this.list = Arrays.asList(array);
    this.index = new int[r];
    this.visited = new boolean[array.length];
    this.combinations = new ArrayList<List<T>>();
    this.r = r;
    this.compute(0);
    this.iterator = this.combinations.iterator();
  }

  private void compute(int n){
    if(n == r){
      List<T> combination = new ArrayList<T>();
      for(int i = 0;i < this.index.length;i++){
        combination.add(list.get(index[i]));
      }
      combinations.add(combination);
    }
    else{
      for(int i = 0;i < this.list.size();i++){
        if(n == 0 || !this.visited[i] && index[n - 1] < i){
          this.visited[i] = true;
          this.index[n] = i;
          this.compute(n + 1);
          this.visited[i] = false;
        }
      }
    }
  }

  public List<List<T>> getCombinations(){
    return this.combinations;
  }

  public int count(){
    return this.combinations.size();
  }

  public List<T> next(){
    return this.iterator.next();
  }

  public boolean hasNext(){
    return this.iterator.hasNext();
  }

  public Iterator<List<T>> iterator(){
    return this.iterator;
  }

  public void remove(){
  }
}