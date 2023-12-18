import java.util.*;import java.io.*;import java.math.*;
public class Main{
  //↓見なくていいよ！ここから------------------------------------------
  static class InputIterator{
    ArrayList<String> inputLine = new ArrayList<String>(1024);
    int index = 0; int max;
    InputIterator(){
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      while(true){
        String read;
        try{
          read = br.readLine();
        }catch(IOException e){
          read = null;
        }
        if(read != null){
          inputLine.add(read);
        }else{
          break;
        }
      }
      max = inputLine.size();
    }
    boolean hasNext(){return (index < max);}
    String next(){
      if(hasNext()){
        String returnStr = inputLine.get(index);
        index++;
        return returnStr;
      }else{
        throw new IndexOutOfBoundsException("これ以上入力はないよ");
      }
    }
  }
  
  static InputIterator ii = new InputIterator();//リアクティブでは使えないので諦めてScanner使うこと
  static PrintWriter out = new PrintWriter(System.out);
  static void flush(){out.flush();}
  static void myout(Object t){out.println(t);}
  static void myerr(Object t){System.err.println(t);}
  static String next(){return ii.next();}
  static int nextInt(){return Integer.parseInt(next());}
  static long nextLong(){return Long.parseLong(next());}
  static ArrayList<String> nextStrArray(){return myHanSpSplit(next());}
  static ArrayList<String> myHanSpSplit(String str){return new ArrayList<String>(Arrays.asList(str.split(" ")));}
  static ArrayList<String> nextCharArray(){return mySingleSplit(next());}
  static ArrayList<String> mySingleSplit(String str){return new ArrayList<String>(Arrays.asList(str.split("")));}
  static ArrayList<Integer> nextIntArray(){
    ArrayList<Integer> ret = new ArrayList<Integer>();
    ArrayList<String> input = nextStrArray();
    for(int i = 0; i < input.size(); i++){
      ret.add(Integer.parseInt(input.get(i)));
    }
    return ret;
  }
  static ArrayList<Long> nextLongArray(){
    ArrayList<Long> ret = new ArrayList<Long>();
    ArrayList<String> input = nextStrArray();
    for(int i = 0; i < input.size(); i++){
      ret.add(Long.parseLong(input.get(i)));
    }
    return ret;
  }
  static String kaigyoToStr(String[] list){return String.join("\n",list);}
  static String kaigyoToStr(ArrayList<String> list){return String.join("\n",list);}
  static String hanSpToStr(String[] list){return String.join(" ",list);}
  static String hanSpToStr(ArrayList<String> list){return String.join(" ",list);}
  public static void main(String[] args){
    solve();
    flush();
  }
  //↑見なくていいよ！ここまで------------------------------------------
  static void solve(){//ここがメイン関数代わり
    ArrayList<Integer> one = nextIntArray();
    int V = one.get(0);
    int E = one.get(1);
    int S = one.get(2);
    Node[] nodes = new Node[V];
    for(int i = 0; i < V; i++){
      nodes[i] = new Node();
    }
    for(int i = 0; i < E; i++){
      ArrayList<Integer> tmp = nextIntArray();
      nodes[tmp.get(0)].dist.put(tmp.get(1), tmp.get(2));
      //nodes[tmp.get(1)].dist.put(tmp.get(0), tmp.get(2));
    }
    nodes[S].cost = 0;
    PriorityQueue<QueueObject> pq = new PriorityQueue<QueueObject>(new originComparator());
    QueueObject first = new QueueObject(S, 0);
    pq.add(first);
    while(pq.size() > 0){
      QueueObject tmp = pq.poll();
      int now = tmp.no;
      int ruisekiCost = tmp.value;
      Iterator it = nodes[now].dist.keySet().iterator();
      while(it.hasNext()){
        int tonari = (int)it.next();
        if(nodes[tonari].cost == -1){
          nodes[tonari].cost = ruisekiCost + nodes[now].dist.get(tonari);
          QueueObject addObj = new QueueObject(tonari, nodes[tonari].cost);
          pq.add(addObj);
        }else if(nodes[tonari].cost > ruisekiCost + nodes[now].dist.get(tonari)){
          nodes[tonari].cost = ruisekiCost + nodes[now].dist.get(tonari);
          QueueObject addObj = new QueueObject(tonari, nodes[tonari].cost);
          pq.add(addObj);
        }
      }
    }
    for(int i = 0; i < V; i++){
      if(nodes[i].cost == -1){
        myout("INF");
      }else{
        myout(nodes[i].cost);
      }
    }
  }
  //Method addition frame start
static class Node{
  HashMap<Integer, Integer> dist = new HashMap<Integer, Integer>();
  int cost = -1;
  boolean access = false;
  void Node(){}
}

static class QueueObject{
  int no;
  int value;
  QueueObject(int n, int v){
    no = n;
    value = v;
  }
  String out(){
    return "no : " + no + ", value : " + value;
  }
}
  
public static class originComparator implements Comparator<QueueObject>{
  public int compare(QueueObject mae, QueueObject ato){
    return mae.value - ato.value;
  }
}
  //Method addition frame end
}

