import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;



public class Main {
    public static void main(String[] args) throws Exception {
        BasicScanner sc = new BasicScanner(System.in);
        int n = sc.nextInt();
        int k = 200001;
        ArrayList<IntPair> ul = new ArrayList<>();
        ArrayList<IntPair> rl = new ArrayList<>();
        IntTreeSet[] dl = new IntTreeSet[k];
        IntTreeSet[] ll = new IntTreeSet[k];
        ArrayList<IntPair> um = new ArrayList<>();
        IntTreeSet[] rm = new IntTreeSet[2 * k];
        ArrayList<IntPair> dm = new ArrayList<>();
        IntTreeSet[] lm = new IntTreeSet[2 * k];
        ArrayList<IntPair> up = new ArrayList<>();
        IntTreeSet[] rp = new IntTreeSet[2 * k];
        ArrayList<IntPair> dp = new ArrayList<>();
        IntTreeSet[] lp = new IntTreeSet[2 * k];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            char u = sc.nextChars()[0];
            if (u == 'U') {
                ul.add(new IntPair(x, y));
                um.add(new IntPair(y - x, x));
                up.add(new IntPair(y + x, x));
            } else if (u == 'R') {
                rl.add(new IntPair(y, x));
                if (rm[y - x + k] == null) rm[y - x + k] = new IntTreeSet();
                rm[y - x + k].add(x);
                if (rp[y + x] == null) rp[y + x] = new IntTreeSet();
                rp[y + x].add(x);
            } else if (u == 'D') {
                if (dl[x] == null) dl[x] = new IntTreeSet();
                dl[x].add(y);
                dm.add(new IntPair(y - x, x));
                dp.add(new IntPair(y + x, x));
            } else if (u == 'L') {
                if (ll[y] == null) ll[y] = new IntTreeSet();
                ll[y].add(x);
                if (lm[y - x + k] == null) lm[y - x + k] = new IntTreeSet();
                lm[y - x + k].add(x);
                if (lp[y + x] == null) lp[y + x] = new IntTreeSet();
                lp[y + x].add(x);
            }
        }
        long min = Long.MAX_VALUE;
        for (IntPair ue : ul) {
            int x = ue.fst;
            if (dl[x] == null) continue;
            int uy = ue.snd;
            IntTreeMap.Entry<?> dy = dl[x].higher(uy);
            if (dy != null) min = Math.min(min, (dy.getKey() - uy) * 5);
        }
        for (IntPair re : rl) {
            int y = re.fst;
            if (ll[y] == null) continue;
            int rx = re.snd;
            IntTreeMap.Entry<?> lx = ll[y].higher(rx);
            if (lx != null) min = Math.min(min, (lx.getKey() - rx) * 5);
        }
        for (IntPair ume : um) {
            int m = ume.fst;
            if (lm[m + k] == null) continue;
            int ux = ume.snd;
            IntTreeMap.Entry<?> lx = lm[m + k].higher(ux);
            if (lx != null) min = Math.min(min, (lx.getKey() - ux) * 10);
        }
        for (IntPair upe : up) {
            int p = upe.fst;
            if (rp[p] == null) continue;
            int ux = upe.snd;
            IntTreeMap.Entry<?> rx = rp[p].lower(ux);
            if (rx != null) min = Math.min(min, (ux - rx.getKey()) * 10);
        }
        for (IntPair dme : dm) {
            int m = dme.fst;
            if (rm[m + k] == null) continue;
            int dx = dme.snd;
            IntTreeMap.Entry<?> rx = rm[m + k].lower(dx);
            if (rx != null) min = Math.min(min, (dx - rx.getKey()) * 10);
        }
        for (IntPair dpe : dp) {
            int p = dpe.fst;
            if (lp[p] == null) continue;
            int dx = dpe.snd;
            IntTreeMap.Entry<?> lx = lp[p].higher(dx);
            if (lx != null) min = Math.min(min, (lx.getKey() - dx) * 10);
        }
        System.out.println(min == Long.MAX_VALUE ? "SAFE" : min);
        Thread.sleep(1000);
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class BasicScanner {
    private final InputStream in;
    private final byte[] buf = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public BasicScanner(InputStream in) {this.in = in;}
    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try {buflen = in.read(buf);}
        catch (final IOException e) {e.printStackTrace();}
        return buflen > 0;
    }
    private int readByte() {return hasNextByte() ? buf[ptr++] : -1;}
    public boolean hasNext() {
        while (hasNextByte() && !(33 <= buf[ptr] && buf[ptr] <= 126)) ptr++;
        return hasNextByte();
    }
    private StringBuilder nextSequence() {
        if (!hasNext()) throw new NoSuchElementException();
        final StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (33 <= b && b <= 126) {sb.appendCodePoint(b); b = readByte();}
        return sb;
    }
    public char nextChar() {
        return (char) readByte();
    }
    public String next() {
        return nextSequence().toString();
    }
    public String next(int len) {
        return new String(nextChars(len));
    }
    public char[] nextChars() {
        final StringBuilder sb = nextSequence();
        int l = sb.length();
        char[] dst = new char[l];
        sb.getChars(0, l, dst, 0);
        return dst;
    }
    public char[] nextChars(int len) {
        if (!hasNext()) throw new NoSuchElementException();
        char[] s = new char[len];
        int i = 0;
        int b = readByte();
        while (33 <= b && b <= 126 && i < len) {s[i++] = (char) b; b = readByte();}
        if (i != len) throw new NoSuchElementException(String.format("length %d is longer than the sequence.", len));
        return s;
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {minus = true; b = readByte();}
        if (b < '0' || '9' < b) throw new NumberFormatException();
        while (true) {
            if ('0' <= b && b <= '9') n = n * 10 + b - '0';
            else if (b == -1 || !(33 <= b && b <= 126)) return minus ? -n : n;
            else throw new NumberFormatException();
            b = readByte();
        }
    }
    public int nextInt() {return Math.toIntExact(nextLong());}
    public double nextDouble() {return Double.parseDouble(next());}
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class IntPair {
    public int fst, snd;
    public IntPair(final int fst, final int snd) {this.fst = fst; this.snd = snd;}
    @Override @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof IntPair)) return false;
        final IntPair p = (IntPair) o;
        return this.fst == p.fst && this.snd == p.snd;
    }
    @Override
    public int hashCode() {return Objects.hash(this.fst, this.snd);}
    @Override
    public String toString() {return "(" + this.fst + ", " + this.snd + ")";}
}



class IntTreeMap<V> implements Iterable<IntTreeMap.Entry<V>> {
    private Entry<V> root;
    private int size = 0;
    private int modCount = 0;
    public int size() {return size;}
    public boolean containsKey(int key) {return getEntry(key) != null;}
    public V get(int key) {
        Entry<V> p = getEntry(key);
        return (p == null ? null : p.value);
    }
    final Entry<V> getEntry(int key) {
        Entry<V> p = root;
        while (p != null) {
            if (key < p.key) p = p.left;
            else if (key > p.key) p = p.right;
            else return p;
        }
        return null;
    }
    final Entry<V> getCeilingEntry(int key) {
        Entry<V> p = root;
        while (p != null) {
            if (key < p.key) {
                if (p.left != null) p = p.left;
                else return p;
            } else if (key > p.key) {
                if (p.right != null) {
                    p = p.right;
                } else {
                    Entry<V> parent = p.parent;
                    Entry<V> ch = p;
                    while (parent != null && ch == parent.right) {
                        ch = parent;
                        parent = parent.parent;
                    }
                    return parent;
                }
            } else return p;
        }
        return null;
    }
    final Entry<V> getFloorEntry(int key) {
        Entry<V> p = root;
        while (p != null) {
            if (key > p.key) {
                if (p.right != null) p = p.right;
                else return p;
            } else if (key < p.key) {
                if (p.left != null) {
                    p = p.left;
                } else {
                    Entry<V> parent = p.parent;
                    Entry<V> ch = p;
                    while (parent != null && ch == parent.left) {
                        ch = parent;
                        parent = parent.parent;
                    }
                    return parent;
                }
            } else return p;
        }
        return null;
    }
    final Entry<V> getHigherEntry(int key) {
        Entry<V> p = root;
        while (p != null) {
            if (key < p.key) {
                if (p.left != null) p = p.left;
                else return p;
            } else {
                if (p.right != null) {
                    p = p.right;
                } else {
                    Entry<V> parent = p.parent;
                    Entry<V> ch = p;
                    while (parent != null && ch == parent.right) {
                        ch = parent;
                        parent = parent.parent;
                    }
                    return parent;
                }
            }
        }
        return null;
    }
    final Entry<V> getLowerEntry(int key) {
        Entry<V> p = root;
        while (p != null) {
            if (key > p.key) {
                if (p.right != null) p = p.right;
                else return p;
            } else {
                if (p.left != null) {
                    p = p.left;
                } else {
                    Entry<V> parent = p.parent;
                    Entry<V> ch = p;
                    while (parent != null && ch == parent.left) {
                        ch = parent;
                        parent = parent.parent;
                    }
                    return parent;
                }
            }
        }
        return null;
    }
    public V put(int key, V value) {
        Entry<V> t = root;
        if (t == null) {
            root = new Entry<>(key, value, null);
            size = 1;
            modCount++;
            return null;
        }
        int cmp;
        Entry<V> parent;
        do {
            parent = t;
            cmp = key > t.key ? 1 : key == t.key ? 0 : -1;
            if (cmp < 0) t = t.left;
            else if (cmp > 0) t = t.right;
            else return t.setValue(value);
        } while (t != null);
        Entry<V> e = new Entry<>(key, value, parent);
        if (cmp < 0) parent.left = e;
        else parent.right = e;
        fixAfterInsertion(e);
        size++;
        modCount++;
        return null;
    }
    public V remove(int key) {
        Entry<V> p = getEntry(key);
        if (p == null) return null;
        V oldValue = p.value;
        deleteEntry(p);
        return oldValue;
    }
    public void clear() {
        modCount++;
        size = 0;
        root = null;
    }
    public Entry<V> firstEntry() {return getFirstEntry();}
    public Entry<V> lastEntry()  {return getLastEntry();}
    public Entry<V> pollFirstEntry() {
        Entry<V> p = getFirstEntry();
        Entry<V> result = p;
        if (p != null) deleteEntry(p);
        return result;
    }
    public Entry<V> pollLastEntry() {
        Entry<V> p = getLastEntry();
        Entry<V> result = p;
        if (p != null) deleteEntry(p);
        return result;
    }
    public Entry<V> lowerEntry(int key) {return getLowerEntry(key);}
    public Entry<V> floorEntry(int key) {return getFloorEntry(key);}
    public Entry<V> ceilingEntry(int key) {return getCeilingEntry(key);}
    public Entry<V> higherEntry(int key) {return getHigherEntry(key);}
    public boolean replace(int key, V oldValue, V newValue) {
        Entry<V> p = getEntry(key);
        if (p != null && Objects.equals(oldValue, p.value)) {
            p.value = newValue;
            return true;
        }
        return false;
    }
    public V replace(int key, V value) {
        Entry<V> p = getEntry(key);
        if (p!=null) {
            V oldValue = p.value;
            p.value = value;
            return oldValue;
        }
        return null;
    }
    public void forEach(IntObjConsumer<V> action) {
        Objects.requireNonNull(action);
        int expectedModCount = modCount;
        for (Entry<V> e = getFirstEntry(); e != null; e = successor(e)) {
            action.accept(e.key, e.value);
            if (expectedModCount != modCount) {
                throw new ConcurrentModificationException();
            }
        }
    }
    public Iterator<Entry<V>> iterator() {
        return new EntryIterator(getFirstEntry());
    }
    public Iterator<Entry<V>> descendingIterator() {
        return new DescendingEntryIterator(getLastEntry());
    }
    abstract class PrivateEntryIterator<T> implements Iterator<T> {
        Entry<V> next;
        Entry<V> lastReturned;
        int expectedModCount;
        PrivateEntryIterator(Entry<V> first) {
            expectedModCount = modCount;
            lastReturned = null;
            next = first;
        }
        public final boolean hasNext() {return next != null;}
        final Entry<V> nextEntry() {
            Entry<V> e = next;
            if (e == null) throw new NoSuchElementException();
            if (modCount != expectedModCount) throw new ConcurrentModificationException();
            next = successor(e);
            lastReturned = e;
            return e;
        }
        final Entry<V> prevEntry() {
            Entry<V> e = next;
            if (e == null) throw new NoSuchElementException();
            if (modCount != expectedModCount) throw new ConcurrentModificationException();
            next = predecessor(e);
            lastReturned = e;
            return e;
        }
        public void remove() {
            if (lastReturned == null) throw new IllegalStateException();
            if (modCount != expectedModCount) throw new ConcurrentModificationException();
            if (lastReturned.left != null && lastReturned.right != null) next = lastReturned;
            deleteEntry(lastReturned);
            expectedModCount = modCount;
            lastReturned = null;
        }
    }
    final class EntryIterator extends PrivateEntryIterator<Entry<V>> {
        EntryIterator(Entry<V> first) {super(first);}
        public Entry<V> next() {return nextEntry();}
    }
    final class DescendingEntryIterator extends PrivateEntryIterator<Entry<V>> {
        DescendingEntryIterator(Entry<V> first) {super(first);}
        public Entry<V> next() {return prevEntry();}
    }

    private static final boolean RED   = false;
    private static final boolean BLACK = true;

    public static final class Entry<V> {
        int key;
        V value;
        Entry<V> left;
        Entry<V> right;
        Entry<V> parent;
        boolean color = BLACK;
        Entry(int key, V value, Entry<V> parent) {
            this.key = key;
            this.value = value;
            this.parent = parent;
        }
        public int getKey() {return key;}
        public V getValue() {return value;}
        public V setValue(V value) {
            V oldValue = this.value;
            this.value = value;
            return oldValue;
        }
        public boolean equals(Object o) {
            if (!(o instanceof Entry)) return false;
            Entry<?> e = (Entry<?>) o;
            return key == e.getKey() && (value == null ? e.value == null : value.equals(e.value));
        }
        public int hashCode() {
            int keyHash = key;
            int valueHash = (value == null ? 0 : value.hashCode());
            return keyHash ^ valueHash;
        }
        public String toString() {return key + "=" + value;}
    }
    final Entry<V> getFirstEntry() {
        Entry<V> p = root;
        if (p != null) while (p.left != null) p = p.left;
        return p;
    }
    final Entry<V> getLastEntry() {
        Entry<V> p = root;
        if (p != null) while (p.right != null) p = p.right;
        return p;
    }
    static <V> Entry<V> successor(Entry<V> t) {
        if (t == null) return null;
        else if (t.right != null) {
            Entry<V> p = t.right;
            while (p.left != null) p = p.left;
            return p;
        } else {
            Entry<V> p = t.parent;
            Entry<V> ch = t;
            while (p != null && ch == p.right) {
                ch = p;
                p = p.parent;
            }
            return p;
        }
    }
    static <V> Entry<V> predecessor(Entry<V> t) {
        if (t == null) return null;
        else if (t.left != null) {
            Entry<V> p = t.left;
            while (p.right != null) p = p.right;
            return p;
        } else {
            Entry<V> p = t.parent;
            Entry<V> ch = t;
            while (p != null && ch == p.left) {
                ch = p;
                p = p.parent;
            }
            return p;
        }
    }
    private static <V> boolean colorOf(Entry<V> p) {return p == null ? BLACK : p.color;}
    private static <V> Entry<V> parentOf(Entry<V> p) {return p == null ? null: p.parent;}
    private static <K,V> void setColor(Entry<V> p, boolean c) {if (p != null) p.color = c;}
    private static <V> Entry<V> leftOf (Entry<V> p) {return (p == null) ? null: p.left;}
    private static <V> Entry<V> rightOf(Entry<V> p) {return (p == null) ? null: p.right;}
    private void rotateLeft(Entry<V> p) {
        if (p != null) {
            Entry<V> r = p.right;
            p.right = r.left;
            if (r.left != null) r.left.parent = p;
            r.parent = p.parent;
            if (p.parent == null) root = r;
            else if (p.parent.left == p) p.parent.left = r;
            else p.parent.right = r;
            r.left = p;
            p.parent = r;
        }
    }
    private void rotateRight(Entry<V> p) {
        if (p != null) {
            Entry<V> l = p.left;
            p.left = l.right;
            if (l.right != null) l.right.parent = p;
            l.parent = p.parent;
            if (p.parent == null) root = l;
            else if (p.parent.right == p) p.parent.right = l;
            else p.parent.left = l;
            l.right = p;
            p.parent = l;
        }
    }
    private void fixAfterInsertion(Entry<V> x) {
        x.color = RED;
        while (x != null && x != root && x.parent.color == RED) {
            if (parentOf(x) == leftOf(parentOf(parentOf(x)))) {
                Entry<V> y = rightOf(parentOf(parentOf(x)));
                if (colorOf(y) == RED) {
                    setColor(parentOf(x), BLACK);
                    setColor(y, BLACK);
                    setColor(parentOf(parentOf(x)), RED);
                    x = parentOf(parentOf(x));
                } else {
                    if (x == rightOf(parentOf(x))) {
                        x = parentOf(x);
                        rotateLeft(x);
                    }
                    setColor(parentOf(x), BLACK);
                    setColor(parentOf(parentOf(x)), RED);
                    rotateRight(parentOf(parentOf(x)));
                }
            } else {
                Entry<V> y = leftOf(parentOf(parentOf(x)));
                if (colorOf(y) == RED) {
                    setColor(parentOf(x), BLACK);
                    setColor(y, BLACK);
                    setColor(parentOf(parentOf(x)), RED);
                    x = parentOf(parentOf(x));
                } else {
                    if (x == leftOf(parentOf(x))) {
                        x = parentOf(x);
                        rotateRight(x);
                    }
                    setColor(parentOf(x), BLACK);
                    setColor(parentOf(parentOf(x)), RED);
                    rotateLeft(parentOf(parentOf(x)));
                }
            }
        }
        root.color = BLACK;
    }
    private void deleteEntry(Entry<V> p) {
        modCount++;
        size--;
        if (p.left != null && p.right != null) {
            Entry<V> s = successor(p);
            p.key = s.key;
            p.value = s.value;
            p = s;
        }
        Entry<V> replacement = (p.left != null ? p.left : p.right);
        if (replacement != null) {
            replacement.parent = p.parent;
            if (p.parent == null) root = replacement;
            else if (p == p.parent.left) p.parent.left  = replacement;
            else p.parent.right = replacement;
            p.left = p.right = p.parent = null;
            if (p.color == BLACK) fixAfterDeletion(replacement);
        } else if (p.parent == null) {
            root = null;
        } else {
            if (p.color == BLACK) fixAfterDeletion(p);
            if (p.parent != null) {
                if (p == p.parent.left) p.parent.left = null;
                else if (p == p.parent.right) p.parent.right = null;
                p.parent = null;
            }
        }
    }
    private void fixAfterDeletion(Entry<V> x) {
        while (x != root && colorOf(x) == BLACK) {
            if (x == leftOf(parentOf(x))) {
                Entry<V> sib = rightOf(parentOf(x));
                if (colorOf(sib) == RED) {
                    setColor(sib, BLACK);
                    setColor(parentOf(x), RED);
                    rotateLeft(parentOf(x));
                    sib = rightOf(parentOf(x));
                }
                if (colorOf(leftOf(sib))  == BLACK &&
                    colorOf(rightOf(sib)) == BLACK) {
                    setColor(sib, RED);
                    x = parentOf(x);
                } else {
                    if (colorOf(rightOf(sib)) == BLACK) {
                        setColor(leftOf(sib), BLACK);
                        setColor(sib, RED);
                        rotateRight(sib);
                        sib = rightOf(parentOf(x));
                    }
                    setColor(sib, colorOf(parentOf(x)));
                    setColor(parentOf(x), BLACK);
                    setColor(rightOf(sib), BLACK);
                    rotateLeft(parentOf(x));
                    x = root;
                }
            } else {
                Entry<V> sib = leftOf(parentOf(x));
                if (colorOf(sib) == RED) {
                    setColor(sib, BLACK);
                    setColor(parentOf(x), RED);
                    rotateRight(parentOf(x));
                    sib = leftOf(parentOf(x));
                }
                if (colorOf(rightOf(sib)) == BLACK &&
                    colorOf(leftOf(sib)) == BLACK) {
                    setColor(sib, RED);
                    x = parentOf(x);
                } else {
                    if (colorOf(leftOf(sib)) == BLACK) {
                        setColor(rightOf(sib), BLACK);
                        setColor(sib, RED);
                        rotateLeft(sib);
                        sib = leftOf(parentOf(x));
                    }
                    setColor(sib, colorOf(parentOf(x)));
                    setColor(parentOf(x), BLACK);
                    setColor(leftOf(sib), BLACK);
                    rotateRight(parentOf(x));
                    x = root;
                }
            }
        }
        setColor(x, BLACK);
    }
}


class IntTreeSet {
    private IntTreeMap<Object> m = new IntTreeMap<>();
    private static final Object PRESENT = new Object();
    public PrimitiveIterator.OfInt iterator() {return new TreeSetIterator();}
    public PrimitiveIterator.OfInt descendingIterator() {return new DescendingTreeSetIterator();}
    public int size() {return m.size();}
    public boolean isEmpty() {return m.size() == 0;}
    public boolean contains(int key) {return m.containsKey(key);}
    public boolean add(int key) {return m.put(key, PRESENT) == null;}
    public boolean remove(int key) {return m.remove(key) == PRESENT;}
    public void clear() {m.clear();}
    public IntTreeMap.Entry<Object> first() {return m.firstEntry();}
    public IntTreeMap.Entry<Object> last () {return m.lastEntry ();}
    public IntTreeMap.Entry<Object> lower  (int e) {return m.lowerEntry  (e);}
    public IntTreeMap.Entry<Object> floor  (int e) {return m.floorEntry  (e);}
    public IntTreeMap.Entry<Object> ceiling(int e) {return m.ceilingEntry(e);}
    public IntTreeMap.Entry<Object> higher (int e) {return m.higherEntry (e);}
    public IntTreeMap.Entry<Object> pollFirst() {return m.pollFirstEntry();}
    public IntTreeMap.Entry<Object> pollLast()  {return m.pollLastEntry ();}
    private class TreeSetIterator implements PrimitiveIterator.OfInt {
        Iterator<IntTreeMap.Entry<Object>> it = m.iterator();
        public boolean hasNext() {return it.hasNext();}
        public int nextInt() {return it.next().key;}
    }
    private class DescendingTreeSetIterator implements PrimitiveIterator.OfInt {
        Iterator<IntTreeMap.Entry<Object>> it = m.descendingIterator();
        public boolean hasNext() {return it.hasNext();}
        public int nextInt() {return it.next().key;}
    }
}


@FunctionalInterface
interface IntObjConsumer<T> {
    public void accept(int x, T y);
    public default Consumer<T> curry(final int x) {return y -> accept(x, y);}
}
